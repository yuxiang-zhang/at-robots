/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.compiler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.Hashtable;
import java.util.Map;
import net.virtualinfinity.atrobots.compiler.AtRobotCompilerOutput;
import net.virtualinfinity.atrobots.compiler.Errors;
import net.virtualinfinity.atrobots.compiler.HardwareSpecification;
import net.virtualinfinity.atrobots.compiler.RobotFactory;
import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Program;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AtRobotCompilerOutputEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Errors errors0 = new Errors();
      errors0.add("", (-1936), (-1936));
      AtRobotCompilerOutput atRobotCompilerOutput0 = new AtRobotCompilerOutput(errors0, (Program) null, (HardwareSpecification) null, (-1936), (DebugInfo) null, "");
      assertNotNull(atRobotCompilerOutput0);
      
      // Undeclared exception!
      try {
        atRobotCompilerOutput0.getProgram();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Can not get the program when there are errors.
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Errors errors0 = new Errors();
      short[] shortArray0 = new short[7];
      Program program0 = new Program(shortArray0);
      HardwareSpecification hardwareSpecification0 = new HardwareSpecification((Map<String, Integer>) null);
      DebugInfo debugInfo0 = new DebugInfo();
      AtRobotCompilerOutput atRobotCompilerOutput0 = new AtRobotCompilerOutput(errors0, program0, hardwareSpecification0, (-753), debugInfo0, "^");
      assertNotNull(atRobotCompilerOutput0);
      
      Errors errors1 = atRobotCompilerOutput0.getErrors();
      assertNotNull(errors1);
      assertEquals(-753, atRobotCompilerOutput0.getMaxProcessorSpeed());
  }

  @Test
  public void test2()  throws Throwable  {
      short[] shortArray0 = new short[3];
      Program program0 = new Program(shortArray0);
      HardwareSpecification hardwareSpecification0 = new HardwareSpecification((Map<String, Integer>) null);
      DebugInfo debugInfo0 = new DebugInfo();
      AtRobotCompilerOutput atRobotCompilerOutput0 = null;
      try {
        atRobotCompilerOutput0 = new AtRobotCompilerOutput((Errors) null, program0, hardwareSpecification0, 0, debugInfo0, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * errors must not be null
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      DebugInfo debugInfo0 = new DebugInfo();
      Errors errors0 = new Errors();
      AtRobotCompilerOutput atRobotCompilerOutput0 = null;
      try {
        atRobotCompilerOutput0 = new AtRobotCompilerOutput(errors0, (Program) null, (HardwareSpecification) null, (-1430), debugInfo0, "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * program must not be null unless there are errors.
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Errors errors0 = new Errors();
      short[] shortArray0 = new short[5];
      Program program0 = new Program(shortArray0);
      Hashtable<String, Integer> hashtable0 = new Hashtable<String, Integer>();
      HardwareSpecification hardwareSpecification0 = new HardwareSpecification((Map<String, Integer>) hashtable0);
      AtRobotCompilerOutput atRobotCompilerOutput0 = null;
      try {
        atRobotCompilerOutput0 = new AtRobotCompilerOutput(errors0, program0, hardwareSpecification0, (int) (short)0, (DebugInfo) null, "b+?\"OkK6SN>~G`od");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * debugInfo must not be null unless there are errors.
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Errors errors0 = new Errors();
      short[] shortArray0 = new short[1];
      Program program0 = new Program(shortArray0);
      DebugInfo debugInfo0 = new DebugInfo();
      AtRobotCompilerOutput atRobotCompilerOutput0 = null;
      try {
        atRobotCompilerOutput0 = new AtRobotCompilerOutput(errors0, program0, (HardwareSpecification) null, (int) (short)0, debugInfo0, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * hardwareSpecification must not be null unless there are errors.
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      Errors errors0 = new Errors();
      short[] shortArray0 = new short[7];
      Program program0 = new Program(shortArray0);
      HardwareSpecification hardwareSpecification0 = new HardwareSpecification((Map<String, Integer>) null);
      DebugInfo debugInfo0 = new DebugInfo();
      AtRobotCompilerOutput atRobotCompilerOutput0 = new AtRobotCompilerOutput(errors0, program0, hardwareSpecification0, (-753), debugInfo0, "^");
      assertNotNull(atRobotCompilerOutput0);
      
      RobotFactory robotFactory0 = atRobotCompilerOutput0.createRobotFactory("^");
      assertNotNull(robotFactory0);
      assertEquals(-753, atRobotCompilerOutput0.getMaxProcessorSpeed());
  }

  @Test
  public void test7()  throws Throwable  {
      Errors errors0 = new Errors();
      short[] shortArray0 = new short[2];
      Program program0 = new Program(shortArray0);
      HardwareSpecification hardwareSpecification0 = new HardwareSpecification((Map<String, Integer>) null);
      DebugInfo debugInfo0 = new DebugInfo();
      errors0.add((String) null, (int) (short)0);
      AtRobotCompilerOutput atRobotCompilerOutput0 = new AtRobotCompilerOutput(errors0, program0, hardwareSpecification0, (int) (short)0, debugInfo0, (String) null);
      assertNotNull(atRobotCompilerOutput0);
      
      // Undeclared exception!
      try {
        atRobotCompilerOutput0.createRobotFactory((String) null);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Can not create an entrant with errors. Check CompilerOutput.hasErrors() first.
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      Errors errors0 = new Errors();
      errors0.info("M1x.yTa");
      HardwareSpecification hardwareSpecification0 = new HardwareSpecification((Map<String, Integer>) null);
      DebugInfo debugInfo0 = new DebugInfo();
      AtRobotCompilerOutput atRobotCompilerOutput0 = new AtRobotCompilerOutput(errors0, (Program) null, hardwareSpecification0, (int) (short)512, debugInfo0, "M1x.yTa");
      assertNotNull(atRobotCompilerOutput0);
      
      // Undeclared exception!
      try {
        atRobotCompilerOutput0.getMessage();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Can not get the message when there are errors.
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      Errors errors0 = new Errors();
      short[] shortArray0 = new short[7];
      Program program0 = new Program(shortArray0);
      HardwareSpecification hardwareSpecification0 = new HardwareSpecification((Map<String, Integer>) null);
      DebugInfo debugInfo0 = new DebugInfo();
      AtRobotCompilerOutput atRobotCompilerOutput0 = new AtRobotCompilerOutput(errors0, program0, hardwareSpecification0, (-753), debugInfo0, "^");
      assertNotNull(atRobotCompilerOutput0);
      
      errors0.add("^", (-753), (int) (short)0);
      // Undeclared exception!
      try {
        atRobotCompilerOutput0.getHardwareSpecification();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Can not get the hardware specification when there are errors.
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      Errors errors0 = new Errors();
      errors0.info("OutOfBounds: @");
      DebugInfo debugInfo0 = new DebugInfo();
      AtRobotCompilerOutput atRobotCompilerOutput0 = new AtRobotCompilerOutput(errors0, (Program) null, (HardwareSpecification) null, 149, debugInfo0, "Unknown instruction: ");
      assertNotNull(atRobotCompilerOutput0);
      
      // Undeclared exception!
      try {
        atRobotCompilerOutput0.getMaxProcessorSpeed();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Can not get the maximum processor speed when there are errors.
         */
      }
  }

  @Test
  public void test11()  throws Throwable  {
      Errors errors0 = new Errors();
      errors0.info("w1kdmdbcvvk<cD)");
      AtRobotCompilerOutput atRobotCompilerOutput0 = new AtRobotCompilerOutput(errors0, (Program) null, (HardwareSpecification) null, 37, (DebugInfo) null, "w1kdmdbcvvk<cD)");
      assertNotNull(atRobotCompilerOutput0);
      
      // Undeclared exception!
      try {
        atRobotCompilerOutput0.getDebugInfo();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Can not get the debug info when there are errors.
         */
      }
  }
}