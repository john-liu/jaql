/*
 * Copyright (C) IBM Corp. 2009.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.ibm.jaql.lang.expr.array;

import com.ibm.jaql.json.type.JsonArray;
import com.ibm.jaql.json.type.JsonValue;
import com.ibm.jaql.json.util.JsonIterator;
import com.ibm.jaql.json.util.SingleJsonValueIterator;
import com.ibm.jaql.lang.core.Context;
import com.ibm.jaql.lang.expr.core.Expr;
import com.ibm.jaql.lang.expr.core.IterExpr;
import com.ibm.jaql.lang.expr.core.JaqlFn;
import com.ibm.jaql.util.Bool3;

/**
 * If the input is an array or null, return it; else wrap in an array.
 * 
 * if( $x instanceof type [*<*>]? ) $x else [$x]
 */
@JaqlFn(fnName = "toArray", minArgs = 1, maxArgs = 1)
public class ToArrayFn extends IterExpr
{
  /**
   * toArray(array)
   * 
   * @param exprs
   */
  public ToArrayFn(Expr[] exprs)
  {
    super(exprs);
  }

  /**
   * @param expr
   */
  public ToArrayFn(Expr expr)
  {
    super(new Expr[]{expr});
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ibm.jaql.lang.expr.core.Expr#isNull()
   */
  @Override
  public Bool3 isNull()
  {
    return exprs[0].isNull();
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ibm.jaql.lang.expr.core.IterExpr#iter(com.ibm.jaql.lang.core.Context)
   */
  @Override
  public JsonIterator iter(final Context context) throws Exception
  {
    JsonValue val = exprs[0].eval(context);
    if( val == null )
    {
      return JsonIterator.NULL;
    }
    else if( val instanceof JsonArray )
    {
      return ((JsonArray)val).iter();
    }
    else
    {
      return new SingleJsonValueIterator(val);
    }
  }
}
