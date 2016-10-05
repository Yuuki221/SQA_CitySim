/**
 * 
 */
package Test;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.junit.Test;

import Program.Visitor;

/**
 * @author pengxuechan
 *
 */
public class VisitorTest {

	@Test
	public void testStudentLike() {
		Visitor testVis = new Visitor(1);
		assertTrue(testVis.likeMap.get("Student").length==3);
	}
	
	@Test
	public void testBloggerLike() {
		Visitor testVis = new Visitor(2);
		assertTrue(testVis.likeMap.get("Blogger").length==0);
	}

}
