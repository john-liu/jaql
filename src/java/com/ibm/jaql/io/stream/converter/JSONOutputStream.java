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
package com.ibm.jaql.io.stream.converter;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.ibm.jaql.io.converter.ItemToStream;
import com.ibm.jaql.json.type.Item;

/**
 * 
 */
public class JSONOutputStream implements ItemToStream
{
  private DataOutputStream output;

  /*
   * (non-Javadoc)
   * 
   * @see com.ibm.jaql.io.converter.ItemToStream#close()
   */
  public void close() throws IOException
  {
    if (output != null)
    {
      output.flush();
      output.close();
    }
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ibm.jaql.io.converter.ItemToStream#setOutputStream(java.io.OutputStream)
   */
  public void setOutputStream(OutputStream out)
  {
    output = new DataOutputStream(out);
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ibm.jaql.io.converter.ItemToStream#write(com.ibm.jaql.json.type.Item)
   */
  public void write(Item i) throws IOException
  {
    i.write(output);
  }

}
