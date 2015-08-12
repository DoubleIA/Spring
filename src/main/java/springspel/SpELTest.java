package springspel;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class SpELTest {
	
	/*
	 * 'HelloWorld': HelloWorld 
	 * 'HelloWorld'.concat('!'): HelloWorld!
	 * 'HelloWorld'.bytes: [B@65db0c7e 
	 * 'HelloWorld'.bytes.length: 10 
	 * new String('helloWorld').toUpperCase(): HELLOWORLD 
	 * person is root, name expression: Double 
	 * true 
	 * list[0]: false
	 */
	
	public static void main(String[] args) {
		
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("'HelloWorld'");
		System.out.println("'HelloWorld': " + exp.getValue());
		
		exp = parser.parseExpression("'HelloWorld'.concat('!')");
		System.out.println("'HelloWorld'.concat('!'): " + exp.getValue());
		
		exp = parser.parseExpression("'HelloWorld'.bytes");
		System.out.println("'HelloWorld'.bytes" + exp.getValue());
		
		exp = parser.parseExpression("'HelloWorld'.bytes.length");
		System.out.println("'HelloWorld'.bytes.length: " + exp.getValue());
		
		exp = parser.parseExpression("new String('helloWorld').toUpperCase()");
		System.out.println("new String('helloWorld').toUpperCase():" + exp.getValue(String.class));

		Person person = new Person(18, "Double", new Date());
		exp = parser.parseExpression("name");
		System.out.println("person is root, name expression: " + exp.getValue(person, String.class));
		
		exp = parser.parseExpression("name=='Double'");
		StandardEvaluationContext ctx = new StandardEvaluationContext();
		ctx.setRootObject(person);
		System.out.println(exp.getValue(ctx, Boolean.class));
		
		List<Boolean> list = new ArrayList<Boolean>();
		list.add(true);
		EvaluationContext ctx2 = new StandardEvaluationContext();
		ctx2.setVariable("list", list);
		parser.parseExpression("#list[0]").setValue(ctx2, "false");
		System.out.println("list[0]: " + parser.parseExpression("#list[0]").getValue(ctx2));
		
		System.out.println("1.Direct expression=============================================");
		Expression expr = parser.parseExpression("'Hellow World'");
		System.out.println(expr.getValue(String.class));
		expr = parser.parseExpression("0.23");
		System.out.println(expr.getValue(Double.class));
		
		/*
		 * 1.动态创建。 2.静态创建。
		 */
		System.out.println("2.Array expression==============================================");
		expr = parser.parseExpression("new String[] {'java', 'Struts', 'Spring'}");
		System.out.println(expr.getValue());
		expr = parser.parseExpression("new int[2][4]");
		System.out.println(expr.getValue());
		
		System.out.println("3.List expression===============================================");
		expr = parser.parseExpression("{'java', 'Struts', 'Spring'}");
		System.out.println(expr.getValue());
		expr = parser.parseExpression("{{'Double', 'Blues'},{'Dabo', 'Lanbo'}}");
		System.out.println(expr.getValue());
		
		/*
		 * list[index], map[key]
		 */
		System.out.println("4.Access to List and Map========================================");
		List<String> li = new ArrayList<String>();
		li.add("Double");
		li.add("Blues");
		
		Map<String, Double> map = new HashMap<String, Double>();
		map.put("Double", 21.75);
		map.put("Blues", 20.8);
		
		ctx.setVariable("mylist", li);
		ctx.setVariable("mymap", map);
		System.out.println(parser.parseExpression("#mylist[1]").getValue(ctx));
		System.out.println(parser.parseExpression("#mymap['Double']").getValue(ctx));
		
		System.out.println("5.Invoke methods================================================");
		System.out.println(parser.parseExpression("'HelloWorld'.substring(2,5)").getValue());
		List<String> li2 = new ArrayList<String>();
		li2.add("java");
		li2.add("struts");
		li2.add("spring");
		li2.add("hibernate");
		ctx.setVariable("mylist2", li2);
		System.out.println(parser.parseExpression("#mylist2.subList(1,3)").getValue(ctx));
		
		System.out.println("6.Arithmetic,compare,logic and evaluation=======================");
		List<String> li3 = new ArrayList<String>();
		li3.add("java");
		li3.add("struts");
		li3.add("spring");
		li3.add("hibernate");
		ctx.setVariable("mylist3", li3);
		parser.parseExpression("#mylist3[0]='Study java'").getValue(ctx);
		System.out.println(li3.get(0));
		System.out.println(parser.parseExpression("#mylist3.size()>3?'mylist3.size() > 3':'mylist3.size() <= 3'").getValue(ctx));
		
		System.out.println("7.Type oprational symbol========================================");
		System.out.println(parser.parseExpression("T(java.lang.Math).random()").getValue());
		System.out.println(parser.parseExpression("T(System).getProperty('os.name')").getValue());
		
		System.out.println("8.Constructor===================================================");
		System.out.println(parser.parseExpression("new String('Hello world').substring(2,4)").getValue());
		System.out.println(parser.parseExpression("new javax.swing.JFrame('Test')").getValue());
		
		System.out.println("9.Variable======================================================");
		System.out.println("setVariable(String name, Object value); #name; #this; #root.");
		
		System.out.println("10.Function=====================================================");
		System.out.println("registerFunction(String name, Method m); Doesn't make sense.");
		
		System.out.println("11.Elvis operational symbol=====================================");
		System.out.println("name != null ? name : 'newVal'; name>:'newVal'");
		
		System.out.println("12.Safe navigator===============================================");
		//Safe
		System.out.println(parser.parseExpression("#foo?.bar").getValue());
		//Not safe NullPointerException
//		System.out.println(parser.parseExpression("#foo.bar").getValue());
		
		/*
		 * collection.?[conditon_expr]
		 */
		System.out.println("13.Collection choice===========================================");
		List<String> li4 = new ArrayList<String>();
		li4.add("Java");
		li4.add("Ajax");
		li4.add("IOS");
		li4.add("J2EE");
		ctx.setVariable("mylist4", li4);
		expr = parser.parseExpression("#mylist4.?[length()>7]");
		System.out.println(expr.getValue(ctx));
		
		Map<String, Double> map2 = new HashMap<String, Double>();
		map2.put("Java", 89.0);
		map2.put("Spring", 82.0);
		map2.put("Englist", 75.0);
		ctx.setVariable("mymap2", map2);
		expr = parser.parseExpression("#mymap2.?[value>80]");
		System.out.println(expr.getValue(ctx));
		
		/*
		 * collection.![condition_expr]
		 */
		System.out.println("14.Collection projecting=======================================");
		List<String> li5 = new ArrayList<String>();
		li5.add("Java");
		li5.add("Ajax");
		li5.add("IOS");
		li5.add("J2EE");
		ctx.setVariable("mylist5", li5);
		expr = parser.parseExpression("#mylist5.![length()]");
		System.out.println(expr.getValue(ctx));
		
		List<Person> li6 = new ArrayList<Person>();
		li6.add(new Person(21, "Double", new Date()));
		li6.add(new Person(20, "Blues", new Date()));
		li6.add(new Person(2, "Baby", new Date()));
		ctx.setVariable("mylist6", li6);
		expr = parser.parseExpression("#mylist6.![name]");
		System.out.println(expr.getValue(ctx));
		
		System.out.println("15.Expression template==========================================");
		Person p1 = new Person(21, "Double", new Date());
		Person p2 = new Person(20, "Blues", new Date());
		expr = parser.parseExpression("My name is #{name}, I'm #{age} years old.", new TemplateParserContext());
		System.out.println(expr.getValue(p1));
		System.out.println(expr.getValue(p2));
		
		
	}
	
}
