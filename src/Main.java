import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Scanner;
import java.nio.file.Paths;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws IOException{

        int adjective_counter = 0;
        int verb_counter = 0;
        int adverb_counter = 0;

        String readingFile = "./info";
        String contents = readUsingScanner(readingFile);

        System.out.println("Text from file: " + contents);

        Pattern adjective_pattern = Pattern.compile("(\\b[А-Яа-я]+(ого|его|ому|ему|ой|ый|ым|им|ом|ем|ей|ую|юю|ое|ее|ий)+( |\\.))");
        Pattern verb_pattern = Pattern.compile("(\\b[А-Яа-я]+(ешь|ет|ем|ете|ишь|ит|им|ите|и|тся|ться|ись|ть)+( |\\.))");
        Pattern adverb_pattern = Pattern.compile("(\\b[А-Яа-я]+(о|а)+( |\\.))");

        Matcher adjective_matcher = adjective_pattern.matcher(contents);
        while(adjective_matcher.find()){
            System.out.println("found: " + adjective_matcher.group());
            System.out.println("start position: " + adjective_matcher.start());
            System.out.println("end position: " + adjective_matcher.end());
            adjective_counter = adjective_counter+1;
            System.out.println();
        }

        Matcher verb_matcher = verb_pattern.matcher(contents);
        while(verb_matcher.find()){
            System.out.println("found: " + verb_matcher.group());
            System.out.println("start position: " + verb_matcher.start());
            System.out.println("end position: " + verb_matcher.end());
            verb_counter = verb_counter+1;
            System.out.println();
        }

        Matcher adverb_matcher = adverb_pattern.matcher(contents);
        while(adverb_matcher.find()){
            System.out.println("found: " + adverb_matcher.group());
            System.out.println("start position: " + adverb_matcher.start());
            System.out.println("end position: " + adverb_matcher.end());
            adverb_counter = adverb_counter+1;
            System.out.println();
        }

        System.out.println("Adjective Counter: " + adjective_counter);
        System.out.println("Verb Counter: " + verb_counter);
        System.out.println("Adverb Counter: " + adverb_counter);
    }

    public static String readUsingScanner(String readingFile) throws IOException {
        Scanner scanner = new Scanner(Paths.get(readingFile), StandardCharsets.UTF_8.name());
        String data = scanner.useDelimiter("\\A").next();
        scanner.close();
        return data;
    }
}