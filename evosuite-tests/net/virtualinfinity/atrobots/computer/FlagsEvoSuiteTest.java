/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.computer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.virtualinfinity.atrobots.computer.Flags;
import net.virtualinfinity.atrobots.computer.Memory;
import net.virtualinfinity.atrobots.computer.MemoryArray;
import net.virtualinfinity.atrobots.computer.MemoryCell;
import net.virtualinfinity.atrobots.computer.RandomAccessMemoryArray;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class FlagsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Flags flags0 = new Flags((MemoryCell) null);
      flags0.setGreater(false);
  }

  @Test
  public void test1()  throws Throwable  {
      Flags flags0 = new Flags((MemoryCell) null);
      flags0.setEqual(false);
  }

  @Test
  public void test2()  throws Throwable  {
      Flags flags0 = new Flags((MemoryCell) null);
      // Undeclared exception!
      try {
        flags0.setZero(true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Memory memory0 = new Memory();
      MemoryCell memoryCell0 = memory0.getCell(1509);
      Flags flags0 = new Flags(memoryCell0);
      // Undeclared exception!
      try {
        flags0.reset();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Memory memory0 = new Memory();
      RandomAccessMemoryArray randomAccessMemoryArray0 = new RandomAccessMemoryArray(217);
      memory0.addMemoryArray((MemoryArray) randomAccessMemoryArray0);
      MemoryCell memoryCell0 = new MemoryCell(memory0, 4);
      Flags flags0 = new Flags(memoryCell0);
      flags0.setLess(true);
      String string0 = flags0.toString();
      assertEquals(2, memoryCell0.signed());
      assertEquals("eLgz", string0);
  }
}