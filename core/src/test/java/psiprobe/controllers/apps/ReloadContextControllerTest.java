/**
 * Licensed under the GPL License. You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   https://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 *
 * THIS PACKAGE IS PROVIDED "AS IS" AND WITHOUT ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING,
 * WITHOUT LIMITATION, THE IMPLIED WARRANTIES OF MERCHANTIBILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE.
 */
package psiprobe.controllers.apps;

import org.junit.Test;

import com.codebox.bean.JavaBeanTester;

/**
 * The Class ReloadContextControllerTest.
 */
public class ReloadContextControllerTest {

  /**
   * Javabean tester.
   */
  @Test
  public void javabeanTester() {
    JavaBeanTester.builder(ReloadContextController.class)
        .skip("applicationContext", "supportedMethods").test();
  }

  /**
   * Javabean tester summary.
   */
  @Test
  public void javabeanTesterSummary() {
    JavaBeanTester.builder(ReloadSummaryContextController.class)
        .skip("applicationContext", "supportedMethods").test();
  }

}
