package IOReading;
import java.util.StringTokenizer;
public class StringTokenizerD {
    

    public static void main(String[] args) {
        
        String s = "Oi meu Chapa.";
        StringTokenizer st = new StringTokenizer(s);
        String cth = "Ph'nglui,mglw'nafh,Cthulhu,R'lyeh,wgah'nagl,fhtagn";
        StringTokenizer ts = new StringTokenizer(cth, ",");
        String doid = "Throw a stick, and the servile dog wheezes and pants and stumbles to bring it to you. Do the same before a cat, and he will eye you with coolly polite and somewhat bored amusement. And just as inferior people prefer the inferior animal which scampers excitedly because someone else wants something, so do superior people respect the superior animal which lives its own life and knows that the puerile stick-throwings of alien bipeds are none of its business and beneath its notice. The dog barks and begs and tumbles to amuse you when you crack the whip. That pleases a meekness-loving peasant who relishes a stimulus to his self importance. The cat, on the other hand, charms you into playing for its benefit when it wishes to be amused; making you rush about the room with a paper on a string when it feels like exercise, but refusing all your attempts to make it play when it is not in the humour. That is personality and individuality and self-respect -- the calm mastery of a being whose life is its own and not yours -- and the superior person recognises and appreciates this because he too is a free soul whose position is assured, and whose only law is his own heritage and aesthetic sense.";
        StringTokenizer tok = new StringTokenizer(doid,"e", false);
        StringTokenizer tik = new StringTokenizer(doid, "t", true);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        System.out.println("----------------------------------------------------------------------------------");
        while(ts.hasMoreTokens()){
            System.out.println(ts.nextToken());
        }
        System.out.println("----------------------------------------------------------------------------------");
        while(tok.hasMoreTokens()){
            System.out.println(tok.nextToken());
        }
        System.out.println("----------------------------------------------------------------------------------");
        while(tik.hasMoreTokens()){
            System.out.println(tik.nextToken());
        }

    }
}
