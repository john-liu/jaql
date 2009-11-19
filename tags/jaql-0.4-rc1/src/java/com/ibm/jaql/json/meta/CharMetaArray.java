/*
 * Copyright (C) IBM Corp. 2008.
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
package com.ibm.jaql.json.meta;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import com.ibm.jaql.json.type.Item;
import com.ibm.jaql.json.type.JLong;
import com.ibm.jaql.json.util.Iter;
import com.ibm.jaql.util.BaseUtil;

/**
 * 
 */
public class CharMetaArray extends MetaArray
{

  /**
   * 
   */
  public CharMetaArray()
  {
    super(char[].class);
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ibm.jaql.json.meta.MetaArray#makeItem()
   */
  @Override
  public Item makeItem()
  {
    return new Item(new JLong());
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ibm.jaql.json.meta.MetaArray#count(java.lang.Object)
   */
  @Override
  public long count(Object obj)
  {
    char[] arr = (char[]) obj;
    return arr.length;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ibm.jaql.json.meta.MetaArray#iter(java.lang.Object)
   */
  @Override
  public Iter iter(Object obj) throws Exception
  {
    final char[] arr = (char[]) obj;
    return new Iter() {
      int   i     = 0;
      JLong jlong = new JLong();
      Item  item  = new Item(jlong);

      @Override
      public Item next() throws Exception
      {
        if (i < arr.length)
        {
          jlong.value = arr[i++];
          return item;
        }
        return null;
      }
    };
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ibm.jaql.json.meta.MetaArray#nth(java.lang.Object, long,
   *      com.ibm.jaql.json.type.Item)
   */
  @Override
  public void nth(Object obj, long n, Item result) throws Exception
  {
    char[] arr = (char[]) obj;
    if (n >= 0 && n < arr.length)
    {
      ((JLong) result.restoreCache()).value = arr[(int) n];
    }
    else
    {
      result.set(null);
    }
  }

  public static final char[] emptyArray = new char[0];

  /*
   * (non-Javadoc)
   * 
   * @see com.ibm.jaql.json.meta.MetaValue#newInstance()
   */
  @Override
  public Object newInstance()
  {
    return emptyArray;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ibm.jaql.json.meta.MetaValue#read(java.io.DataInput,
   *      java.lang.Object)
   */
  @Override
  public Object read(DataInput in, Object obj) throws IOException
  {
    char[] arr = (char[]) obj;
    int len = BaseUtil.readVUInt(in);
    if (len != arr.length)
    {
      arr = new char[len];
    }
    for (int i = 0; i < len; i++)
    {
      arr[i] = in.readChar();
    }
    return arr;
  }

  @Override
  public void write(DataOutput out, Object obj) throws IOException
  {
    char[] arr = (char[]) obj;
    BaseUtil.writeVUInt(out, arr.length);
    for (int i = 0; i < arr.length; i++)
    {
      out.writeChar(arr[i]);
    }
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ibm.jaql.json.meta.MetaArray#copy(java.lang.Object,
   *      java.lang.Object)
   */
  @Override
  public Object copy(Object toValue, Object fromValue)
  {
    char[] to = (char[]) toValue;
    char[] from = (char[]) fromValue;
    if (to.length != from.length)
    {
      to = new char[from.length];
    }
    for (int i = 0; i < from.length; i++)
    {
      to[i] = from[i];
    }
    return to;
  }
}