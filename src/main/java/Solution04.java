import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Diego Figueroa
 */
/*
Print: Enter a noun:
Save into string variable noun
Print: Enter a verb:
Save into string variable verb
Print: Enter a adjective:
Save into string variable adjective
Print: Enter a adverb:
Save into string variable adverb
Print: Do you 'verb' your 'adjective' 'noun' 'adverb'? That's hilarious!
 */
public class Solution04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a noun: ");
        String noun = sc.nextLine();
        System.out.printf("Enter a verb: ");
        String verb = sc.nextLine();
        System.out.printf("Enter a adjective: ");
        String adjective = sc.nextLine();
        System.out.printf("Enter a adverb: ");
        String adverb = sc.nextLine();
        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
    }
}
