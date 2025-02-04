import zemberek.morphology.TurkishMorphology;
import zemberek.morphology.analysis.SingleAnalysis;
import zemberek.morphology.analysis.WordAnalysis;
import zemberek.normalization.TurkishSpellChecker;
import zemberek.tokenization.TurkishSentenceExtractor;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SpellChecker {
    public static void main(String[] args) throws IOException {
        TurkishMorphology morphology = TurkishMorphology.createWithDefaults();
        TurkishSentenceExtractor tExtractor = TurkishSentenceExtractor.DEFAULT;
        TurkishSpellChecker spellChecker = new TurkishSpellChecker(morphology);
        Scanner scanner = new Scanner(System.in);
        String spell = scanner.next();
        //String Cumle = "Yarin Saat 14'de Doğal Dil İşleme Dersim Var.";
        String [] kelimeler = spell.split(" ");
        List<String>kelimelerList= new ArrayList<>();
        //System.out.println(kelimeler+"\n"+"Kelimelerin Analizi:");

        WordAnalysis analysis = morphology.analyze(Arrays.toString(kelimeler));

        for (String kelime: kelimeler){
            kelimelerList.add(kelime);
        }

        for (String kelime: kelimelerList){
            if (spellChecker.check(kelime)){
                System.out.println(kelime+" Kelimesi Doğru Yazılmıştır.");
            }
            else {
                System.out.println(kelime+" Kelimesi Yanlış Yazılmıştır.");
            }
        }


    }
}