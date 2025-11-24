// Incomputer science, aset isanabstractdatatypethatcanstorecertainvalues,withoutany
//  particularorder,andnorepeatedvalues(Wikipedia). isanexampleofaset,but isnotaset.
//  Todayyouwilllearnhowtousesetsinjavabysolvingthisproblem.
//  Youaregiven pairsofstrings.Twopairsareidenticalif and.Thatalsoimpliesitisnotsame
//  as.Aftertakingeachpairasinput,youneedtoprintthenumberofuniquepairsyoucurrently
//  have.
//  InputFormat
//  Inthefirst line, therewillbeaninteger denotingthenumberofpairs.Eachofthenext lines
//  willcontaintwostringsseparatedbyasinglespace.
//  Constraints:
//  Lengthofeachstringisatmost andwillconsistoflowercaselettersonly.
//  OutputFormat
//  Print lines.Inthe line,printthenumberofuniquepairsyouhaveaftertakingapairasinput.
//  SampleInput
//  5
//  johntom
//  johnmary
//  johntom
//  maryanna
//  maryanna
//  SampleOutput
//  1
//  2
//  2
//  3
//  3
//  Explanation
//  Aftertakingthefirstinput,youhaveonlyonepair:(john,tom)
//  52
// After taking the second input, you have two pairs: (john, tom) and (john, mary)
//  After taking the third input, you still have two unique pairs.
//  After taking the fourth input, you have three unique pairs: (john,tom), (john, mary) and (mary,
//  anna)
//  After taking the fifth input, you still have three unique pairs.
package Day4.Collections;
import java.util.*;
public class uniquepairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        Set<String> uniquePairs = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String pair = sc.nextLine();
            uniquePairs.add(pair);
            System.out.println(uniquePairs.size());
        }
    }
}