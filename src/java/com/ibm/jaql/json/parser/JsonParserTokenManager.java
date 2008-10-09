/* Generated By:JavaCC: Do not edit this line. JsonParserTokenManager.java */
package com.ibm.jaql.json.parser;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import com.ibm.jaql.json.constructor.JConstructor;
import com.ibm.jaql.json.type.Item;
import com.ibm.jaql.json.type.JString;
import com.ibm.jaql.json.type.JLong;
import com.ibm.jaql.json.type.JDecimal;
import com.ibm.jaql.json.type.JDouble;
import com.ibm.jaql.json.type.JBool;
import com.ibm.jaql.json.type.FixedJArray;
import com.ibm.jaql.json.type.MemoryJRecord;
import com.ibm.jaql.util.BaseUtil;

/** Token Manager. */
public class JsonParserTokenManager implements JsonParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_1(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x3fe10000000L) != 0L)
            return 2;
         return -1;
      case 1:
         if ((active0 & 0x10000000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 1;
            return -1;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_1(int pos, long active0)
{
   return jjMoveNfa_1(jjStopStringLiteralDfa_1(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 31);
      case 13:
         jjmatchedKind = 32;
         return jjMoveStringLiteralDfa1_1(0x40000000L);
      case 39:
         return jjStopAtPos(0, 26);
      case 92:
         return jjMoveStringLiteralDfa1_1(0x3fe10000000L);
      default :
         return jjMoveNfa_1(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_1(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x40000000L) != 0L)
            return jjStopAtPos(1, 30);
         break;
      case 13:
         return jjMoveStringLiteralDfa2_1(active0, 0x10000000L);
      case 34:
         if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(1, 34);
         break;
      case 39:
         if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(1, 33);
         break;
      case 47:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(1, 36);
         break;
      case 92:
         if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(1, 35);
         break;
      case 98:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         break;
      case 102:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(1, 38);
         break;
      case 110:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(1, 39);
         break;
      case 114:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(1, 40);
         break;
      case 116:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(1, 41);
         break;
      default :
         break;
   }
   return jjStartNfa_1(0, active0);
}
private int jjMoveStringLiteralDfa2_1(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_1(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_1(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x10000000L) != 0L)
            return jjStopAtPos(2, 28);
         break;
      default :
         break;
   }
   return jjStartNfa_1(1, active0);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_1(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 11;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xffffffffffffdbffL & l) != 0L && kind > 44)
                     kind = 44;
                  break;
               case 2:
                  if ((0x2400L & l) != 0L)
                     kind = 29;
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) != 0L && kind > 42)
                     kind = 42;
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) != 0L && kind > 43)
                     kind = 43;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xffffffffefffffffL & l) != 0L)
                  {
                     if (kind > 44)
                        kind = 44;
                  }
                  else if (curChar == 92)
                     jjAddStates(0, 2);
                  break;
               case 2:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 7;
                  else if ((0x100000001000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 1:
                  if (curChar == 92)
                     jjAddStates(0, 2);
                  break;
               case 3:
                  if ((0x100000001000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 4:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 5:
                  if ((0x7e0000007eL & l) != 0L && kind > 42)
                     kind = 42;
                  break;
               case 6:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 7:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 8:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 9:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 10:
                  if ((0x7e0000007eL & l) != 0L && kind > 43)
                     kind = 43;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2) && kind > 44)
                     kind = 44;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 11 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x200000000000L) != 0L)
            return 15;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 34:
         return jjStopAtPos(0, 25);
      case 39:
         return jjStopAtPos(0, 24);
      case 40:
         return jjStopAtPos(0, 13);
      case 41:
         return jjStopAtPos(0, 14);
      case 43:
         return jjStopAtPos(0, 15);
      case 44:
         return jjStopAtPos(0, 6);
      case 47:
         return jjMoveStringLiteralDfa1_0(0x200000000000L);
      case 58:
         return jjStopAtPos(0, 5);
      case 91:
         return jjStopAtPos(0, 11);
      case 93:
         return jjStopAtPos(0, 12);
      case 123:
         return jjStopAtPos(0, 9);
      case 125:
         return jjStopAtPos(0, 10);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStopAtPos(1, 45);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 35;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 16)
                        kind = 16;
                     jjCheckNAddStates(3, 10);
                  }
                  else if (curChar == 45)
                     jjCheckNAddStates(11, 14);
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 14:
                  if ((0x3ff000800000000L & l) == 0L)
                     break;
                  if (kind > 23)
                     kind = 23;
                  jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 15:
                  if (curChar == 47)
                     jjCheckNAddStates(15, 17);
                  break;
               case 16:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(15, 17);
                  break;
               case 17:
                  if ((0x2400L & l) != 0L && kind > 46)
                     kind = 46;
                  break;
               case 18:
                  if (curChar == 10 && kind > 46)
                     kind = 46;
                  break;
               case 19:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 20:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 21:
                  if (curChar == 45)
                     jjCheckNAddStates(11, 14);
                  break;
               case 22:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjCheckNAdd(22);
                  break;
               case 23:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(23, 24);
                  break;
               case 24:
                  if (curChar == 46)
                     jjCheckNAdd(25);
                  break;
               case 25:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  jjCheckNAdd(25);
                  break;
               case 26:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(26, 27);
                  break;
               case 27:
                  if (curChar == 46)
                     jjCheckNAdd(28);
                  break;
               case 28:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(28, 29);
                  break;
               case 30:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(18, 20);
                  break;
               case 31:
                  if (curChar == 46)
                     jjCheckNAdd(32);
                  break;
               case 32:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(32, 33);
                  break;
               case 34:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjCheckNAddStates(3, 10);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe87ffffffL & l) != 0L)
                  {
                     if (kind > 23)
                        kind = 23;
                     jjCheckNAdd(14);
                  }
                  if ((0x400000004000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  else if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  else if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 1:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 2:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 3:
                  if ((0x2000000020L & l) != 0L && kind > 20)
                     kind = 20;
                  break;
               case 4:
                  if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 5:
                  if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 6:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 7:
                  if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 8:
                  if ((0x2000000020L & l) != 0L && kind > 21)
                     kind = 21;
                  break;
               case 9:
                  if ((0x400000004000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 10:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 11:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 12:
                  if ((0x100000001000L & l) != 0L && kind > 22)
                     kind = 22;
                  break;
               case 13:
               case 14:
                  if ((0x7fffffe87ffffffL & l) == 0L)
                     break;
                  if (kind > 23)
                     kind = 23;
                  jjCheckNAdd(14);
                  break;
               case 16:
                  jjAddStates(15, 17);
                  break;
               case 29:
                  if (curChar == 109 && kind > 18)
                     kind = 18;
                  break;
               case 33:
                  if (curChar == 100 && kind > 19)
                     kind = 19;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 16:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(15, 17);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 35 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_3()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_3(0x800000000000L);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_3(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x800000000000L) != 0L)
            return jjStopAtPos(1, 47);
         break;
      default :
         return 2;
   }
   return 2;
}
private final int jjStopStringLiteralDfa_2(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x3fe10000000L) != 0L)
            return 2;
         return -1;
      case 1:
         if ((active0 & 0x10000000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 1;
            return -1;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_2(int pos, long active0)
{
   return jjMoveNfa_2(jjStopStringLiteralDfa_2(pos, active0), pos + 1);
}
private int jjMoveStringLiteralDfa0_2()
{
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 31);
      case 13:
         jjmatchedKind = 32;
         return jjMoveStringLiteralDfa1_2(0x40000000L);
      case 34:
         return jjStopAtPos(0, 27);
      case 92:
         return jjMoveStringLiteralDfa1_2(0x3fe10000000L);
      default :
         return jjMoveNfa_2(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_2(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_2(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x40000000L) != 0L)
            return jjStopAtPos(1, 30);
         break;
      case 13:
         return jjMoveStringLiteralDfa2_2(active0, 0x10000000L);
      case 34:
         if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(1, 34);
         break;
      case 39:
         if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(1, 33);
         break;
      case 47:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(1, 36);
         break;
      case 92:
         if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(1, 35);
         break;
      case 98:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         break;
      case 102:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(1, 38);
         break;
      case 110:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(1, 39);
         break;
      case 114:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(1, 40);
         break;
      case 116:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(1, 41);
         break;
      default :
         break;
   }
   return jjStartNfa_2(0, active0);
}
private int jjMoveStringLiteralDfa2_2(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_2(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_2(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x10000000L) != 0L)
            return jjStopAtPos(2, 28);
         break;
      default :
         break;
   }
   return jjStartNfa_2(1, active0);
}
private int jjMoveNfa_2(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 11;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xffffffffffffdbffL & l) != 0L && kind > 44)
                     kind = 44;
                  break;
               case 2:
                  if ((0x2400L & l) != 0L)
                     kind = 29;
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) != 0L && kind > 42)
                     kind = 42;
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) != 0L && kind > 43)
                     kind = 43;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xffffffffefffffffL & l) != 0L)
                  {
                     if (kind > 44)
                        kind = 44;
                  }
                  else if (curChar == 92)
                     jjAddStates(0, 2);
                  break;
               case 2:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 7;
                  else if ((0x100000001000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 1:
                  if (curChar == 92)
                     jjAddStates(0, 2);
                  break;
               case 3:
                  if ((0x100000001000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 4:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 5:
                  if ((0x7e0000007eL & l) != 0L && kind > 42)
                     kind = 42;
                  break;
               case 6:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 7:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 8:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 9:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 10:
                  if ((0x7e0000007eL & l) != 0L && kind > 43)
                     kind = 43;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2) && kind > 44)
                     kind = 44;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 11 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   2, 3, 6, 22, 23, 24, 26, 27, 30, 31, 33, 22, 23, 26, 30, 16, 
   17, 19, 30, 31, 33, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\72", "\54", null, null, "\173", "\175", "\133", 
"\135", "\50", "\51", "\53", null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "IN_STRING1",
   "IN_STRING2",
   "WithinComment",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 
   2, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 3, -1, 0, -1, 
};
static final long[] jjtoToken = {
   0xcfffe61L, 
};
static final long[] jjtoSkip = {
   0xe0000000001eL, 
};
static final long[] jjtoMore = {
   0x11ffff3000000L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[35];
private final int[] jjstateSet = new int[70];
private final StringBuilder jjimage = new StringBuilder();
private StringBuilder image = jjimage;
private int jjimageLen;
private int lengthOfMatch;
protected char curChar;
/** Constructor. */
public JsonParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public JsonParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 35; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 4 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         break;
       case 2:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_2();
         break;
       case 3:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_3();
         if (jjmatchedPos == 0 && jjmatchedKind > 48)
         {
            jjmatchedKind = 48;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           TokenLexicalActions(matchedToken);
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
        MoreLexicalActions();
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      case 24 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
                   image.setLength(0);
         break;
      case 25 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
                   image.setLength(0);
         break;
      case 28 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
                         image.setLength(image.length()-3);
         break;
      case 29 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
                         image.setLength(image.length()-2);
         break;
      case 30 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
      int l = image.length();
      image.setLength(l-1);
      image.setCharAt(l-2, '\n');
         break;
      case 32 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
           image.setCharAt(image.length()-1, '\n');
         break;
      case 33 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
      l = image.length();
      image.setLength(l-1);
      image.setCharAt(l-2, '\'');
         break;
      case 34 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
      l = image.length();
      image.setLength(l-1);
      image.setCharAt(l-2, '\"');
         break;
      case 35 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
      l = image.length();
      image.setLength(l-1);
      image.setCharAt(l-2, '\\');
         break;
      case 36 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
      l = image.length();
      image.setLength(l-1);
      image.setCharAt(l-2, '/');
         break;
      case 37 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
      l = image.length();
      image.setLength(l-1);
      image.setCharAt(l-2, '\b');
         break;
      case 38 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
      l = image.length();
      image.setLength(l-1);
      image.setCharAt(l-2, '\f');
         break;
      case 39 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
      l = image.length();
      image.setLength(l-1);
      image.setCharAt(l-2, '\n');
         break;
      case 40 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
      l = image.length();
      image.setLength(l-1);
      image.setCharAt(l-2, '\r');
         break;
      case 41 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
      l = image.length();
      image.setLength(l-1);
      image.setCharAt(l-2, '\t');
         break;
      case 42 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
      l = image.length();
      byte b = BaseUtil.parseHexByte(image.charAt(l-2), image.charAt(l-1));
      image.setLength(l-3);
      image.setCharAt(l-4, (char)(b & 0xff));
         break;
      case 43 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
      l = image.length();
      char c = BaseUtil.parseUnicode(image.charAt(l-4), image.charAt(l-3), image.charAt(l-2), image.charAt(l-1));
      image.setLength(l-5);
      image.setCharAt(l-6, c);
         break;
      default :
         break;
   }
}
void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 26 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                         image.setLength(image.length()-1); matchedToken.image = image.toString();
         break;
      case 27 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                         image.setLength(image.length()-1); matchedToken.image = image.toString();
         break;
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
