/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */

package org.apache.poi.hwpf.model;

public interface CharIndexTranslator {
    /**
     * Calculates the char index of the given byte index.
     * Look forward if index is not in table
     *
     * @param bytePos The character offset to check 
     * @return the char index
     */
    int getCharIndex(int bytePos);

    /**
     * Check if index is in table
     *
     * @param bytePos
     * @return true if index in table, false if not
     */

    boolean isIndexInTable(int bytePos);

    /**
     * Return first index >= bytePos that is in table
     *
     * @param bytePos
     * @return
     */
    public int lookIndexForward(int bytePos);

    /**
     * Return last index <= bytePos that is in table
     *
     * @param bytePos
     * @return
     */
    public int lookIndexBackward(int bytePos);

}
