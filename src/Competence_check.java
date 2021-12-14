public class Competence_check {

    //Leetspeek Translator
    public static void competence_check_01() {
        //Asking for a text to encrypt
        System.out.println("Please enter your message for encryption");
        String inputWords = Scanning.scan.nextLine();

        StringBuilder translatedResult = new StringBuilder();
        for (int i = 0; i < inputWords.length(); i++) {
            char character = inputWords.charAt(i);
            character = Character.toLowerCase(character);
            //A => '@' B => '8' C => '(' D => 'D' E => '3' F => 'F' G => '6' H => '#' I => '!' J => '9' K => 'K' L => '1' M => 'M' N => 'N' O => '0' P => 'P' Q => 'Q' R => 'R' S => '$' T => '7' U => 'U' V => 'V' W => 'W' X => 'X' Y => 'Y' Z => '2'
            character = switch (character) {
                case 'a' -> '@';
                case 'b' -> '8';
                case 'c' -> '(';
                case 'd' -> 'D';
                case 'e' -> '3';
                case 'f' -> 'F';
                case 'g' -> '6';
                case 'h' -> '#';
                case 'i' -> '!';
                case 'j' -> '9';
                case 'k' -> 'K';
                case 'l' -> '1';
                case 'm' -> 'M';
                case 'n' -> 'N';
                case 'o' -> '0';
                case 'p' -> 'P';
                case 'q' -> 'Q';
                case 'r' -> 'R';
                case 's' -> '$';
                case 't' -> '7';
                case 'u' -> 'U';
                case 'v' -> 'V';
                case 'w' -> 'W';
                case 'x' -> 'X';
                case 'y' -> 'Y';
                case 'z' -> '2';
                default -> character;
            };
            /*
            switch (character) {
                case 'a':
                case 'A':
                    character = '@';
                    break;
                case 'b':
                    character = '8';
                    break;
                case 'c':
                    character = '(';
                    break;
                case 'd':
                    character = 'D';
                    break;
                case 'e':
                    character = '3';
                    break;
                case 'f':
                    character = 'F';
                    break;
                case 'g':
                    character = '6';
                    break;
                case 'h':
                    character = '#';
                    break;
                case 'i':
                    character = '!';
                    break;
                case 'j':
                    character = '9';
                    break;
                case 'k':
                    character = 'K';
                    break;
                case 'l':
                    character = '1';
                    break;
                case 'm':
                    character = 'M';
                    break;
                case 'n':
                    character = 'N';
                    break;
                case 'o':
                    character = '0';
                    break;
                case 'p':
                    character = 'P';
                    break;
                case 'q':
                    character = 'Q';
                    break;
                case 'r':
                    character = 'R';
                    break;
                case 's':
                    character = '$';
                    break;
                case 't':
                    character = '7';
                    break;
                case 'u':
                    character = 'U';
                    break;
                case 'v':
                    character = 'V';
                    break;
                case 'w':
                    character = 'W';
                    break;
                case 'x':
                    character = 'X';
                    break;
                case 'y':
                    character = 'Y';
                    break;
                case 'z':
                    character = '2';
                    break;
                default:
                    character = character;
                    break;
            }
            */
            translatedResult.append(character);
        }
        System.out.println(translatedResult);
    }
}

