package other.vlocity;


///**
// * Class for splitting strings into lists of substrings. Constructor
// * can have one or more parameters specifying all separator characters
// * as an enum.
// *
// * Example #1:
// *    new StringSplitter(Separator.PERIOD).split(“foo.bar#baz”);
// *    returns: {“foo”, “bar#baz”}
// *
// * Example #2:
// *    new StringSplitter(Separator.PERIOD, Separator.HASH).split(“foo.bar#baz”);
// *    returns: {“foo”, “bar”, “baz”}
// *
// * IMPLEMENT FOLLOWING:
// *
// * (1) StringSplitter class and Separator enum supporting at two or
// *     more different separators.
// *
// * (2) Some tests for the StringSplitter. TestNG/JUnit approach is preferred
// *
// */
//public class StringSplitter {
//
//    // TODO: Constructor
//
//
//    /**
//     * Splits the given string based on the separator(s) given at
//     * in the constructor.
//     * @param string String to be split
//     * @return Resulting list of substrings.
//     */
//    public ??? split(String string) {
//        // TODO: Code goes here
//    }
//}
//
//public enum Separator {
//    // TODO: Code goes here
//}


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(enabled=true)
public class StringSplitterTest {

    public Character delimiter1;
    public Character delimiter2;
    public static TreeSet<Character> dm = new TreeSet<Character>();

    public StringSplitterTest(SEPARATOR period) {
        delimiter1 = period.getName();
        dm.add(delimiter1);

    }

    public StringSplitterTest(SEPARATOR period,SEPARATOR hash) {
        delimiter1 = period.getName();
        delimiter2=hash.getName();

        dm.add(delimiter1);
        dm.add(delimiter2);
    }


	/*public static void main(String[] args) {
		String str = "foo.bar#baz.jk#fghg#g#ju";
		//String  list[] = new StringSplitter(SEPARATOR.PERIOD).splitedValue(str);
		String list1[] = new StringSplitter(SEPARATOR.PERIOD,SEPARATOR.HASH).splitedValue(str);

		for (String word : list1) {
			System.out.println(word.trim());
		}
	}*/


    @Test(enabled=true)
    public void StringSplitterTesting() {

        String str = "foo.bar#RTT";
        String exp[]= { "foo","bar","RTT"};
        String list1[] = new StringSplitterTest(SEPARATOR.PERIOD,SEPARATOR.HASH).splitedValue(str);


        Assert.assertTrue(Arrays.equals(exp, list1), "TEST FAILED");



    }


    public String[] splitedValue(String str) {

        //char[] chararray=str.toCharArray();

        int len=str.length();

        List<String> Result = new ArrayList<String>();

        StringBuilder sb=new StringBuilder("");

        for(int i=0;i<=len;++i)
        {

            if(i==len)
            {
                Result.add(sb.toString());
                sb.setLength(0);
                break;
            }

            if(!(dm.contains(str.charAt(i))))
            {
                sb.append(str.charAt(i));
            }

            else
            {
                Result.add(sb.toString());
                sb.setLength(0);

            }



        }

        dm.clear();

        return (String[]) Result.toArray(new String[Result.size()]);


    }

    public enum SEPARATOR {
        PERIOD('.'), HASH('#');

        private final char name;

        SEPARATOR(char name) {
            this.name = name;
        }

        public char getName() {
            return this.name;
        }
    }
}
