/**
 * TODO describe the class
 * 
 * @author TODO put your username here
 * @version TODO put the date here
 */

public class Guesser {

    /**
     * TODO documentation for the method
     */
    public static String play(GuessWhoGame g) {
        // decision tree
        if (g.isWearingHat()) {
            // will be bob, dave, emily, gertrude, robert, sarah, exavier
            if (g.isSmiling()) {
                // will be dave, emily, gertrude, robert, sarah, xavier 
                if (g.isWearingGlasses()) {
                    // will be emily, gertrude, sarah, xavier
                    if (g.shirtIsColor(Color.GREEN)) {
                        // will be xavier
                        return "Xavier"; 
                    }
                    else if (g.shirtIsColor(Color.RED)) {
                        // will be emily
                        return "Emily"; 
                    }
                    // shirt is not red or green
                    else {
                        // will be gertrude or sarah
                        if (g.eyeIsColor(Color.BLUE)) {
                            // will be gertrude
                            return "Gertrude"; 
                        }
                        // eyes are not blue
                        else {
                            // will be sarah
                            return "Sarah";
                        }
                    }
                }
                // not wearing glasses
                else {
                    // will be dave, robert
                    if (g.shirtIsColor(Color.RED)) {
                        // will be robert
                        return "Robert"; 
                    }
                    // shirt is not red
                    else {
                        // will be Dave
                        return "Dave";
                    }
                }
            }
            // not smiling
            else {
                // will be bob
                return "Bob";
            }
            
        }
        else {
            // will be alice, carol, frank, henry, isabelle, jack, karen, larry, mallie, nick, 
            // olivia, phillip, quinn, tucker, ursula, victor, wendy, yasmine, zander
            if (g.isSmiling()) {
                // will be alice, frank, henry, isabelle, jack, karen, mallie, nick, olivia, phillip,
                // quinn, tucker, ursula, victor, yasmine, zander
                if (g.isWearingGlasses()) {
                    // will be alice, frank, henry, isabelle, mallie, victor, yasmine
                    if (g.shirtIsColor(Color.RED)) {
                        // will be henry, mallie
                        if (g.eyeIsColor(Color.BLUE)) {
                            // will be Mallie
                            return "Mallie";
                        }
                        // eyes are not blue
                        else {
                            // will be henry
                            return "Henry";
                        }
                    }
                    else if (g.shirtIsColor(Color.GREEN)) {
                        // will be yasmine, alice, frank, isabelle
                        if (g.eyeIsColor(Color.BLUE)) {
                            // will be yasmine, alice
                            if (g.hairIsColor(Color.RED)) {
                                // will be yasmine
                                return "Yasmine";
                            }
                            // hair is not red
                            else {
                                // will be alice
                                return "Alice";
                            }
                        }
                        else if (g.eyeIsColor(Color.GREEN)) {
                            // will be frank
                            return "Frank";
                        }
                        // eyes are not green or blue
                        else {
                            // will be isabelle
                            return "Isabelle";
                        }
                    }
                    // shirt is not green or red
                    else {
                        // will be victor 
                        return "Victor";
                    }
                }
                // not wearing glasses
                else {
                    // will be jack, karen, nick, olivia, phillip, quinn, tucker, ursula, zander
                    if (g.shirtIsColor(Color.BLUE)) {
                        // will be jack, olivia, tucker, zander
                        if (g.eyeIsColor(Color.BLUE)) {
                            // will be tucker
                            return "Tucker";
                        }
                        // eye is not blue
                        else {
                            // will be jack, olivia, zander
                            if (g.hairIsColor(Color.BLOND)) {
                                // will be jack
                                return "Jack";
                            }
                            else if (g.hairIsColor(Color.BLACK)) {
                                // will be olivia
                                return "Olivia";
                            }
                            // hair is not blond or black
                            else {
                                // will be zander
                                return "Zander"; 
                            }
                        }
                    }
                    else if (g.shirtIsColor(Color.RED)) {
                        // will be nick, philip, quinn 
                        if (g.eyeIsColor(Color.BLUE)) {
                            // will be nick
                            return "Nick";
                        }
                        else if (g.eyeIsColor(Color.GREEN)) {
                            // will be philip
                            return "Philip";
                        }
                        // eye is not green or blue
                        else {
                            // will be quinn
                            return "Quinn";
                        }
                    }
                    // shirt is not red or blue
                    else {
                        // will be ursula, karen
                        if (g.eyeIsColor(Color.BROWN)) {
                            // will be ursula
                            return "Ursula";
                        }
                        // eye is not brown
                        else {
                            // will be karen
                            return "Karen";
                        }
                    }
                }
            }
            // not smiling 
            else {
                // will be Carol, Larry, Wendy
                if (g.hairIsColor(Color.BLACK)) {
                    // will be Carol
                    return "Carol"; 
                }
                else if (g.hairIsColor(Color.RED)) {
                    // will be Larry
                    return "Larry"; 
                }
                // hair is not red or black 
                else {
                    // will be Wendy
                    return "Wendy";
                }
            }
            
        }
    }

    /**
     * TODO documentation for the main method
     */
    public static void main(String[] args) {
        GuessWhoGame g = new GuessWhoGame(); 
        String character = play(g); 
        if (g.guess(character) == true) {
            System.out.println("Correct!"); 
        }
        else {
            System.out.println("Wrong"); 
        }
        System.out.println(g.score()); 
        // TODO instantiate the GuessWhoGame class
        // TODO play the game and get the name of the character
        // TODO use the guess method of the GuessWhoGame object to guess the name of the character
        // TODO print whether your guess was correct or not
        // TODO print your score (call the score method on the GuessWhoGame object)
    }
}
