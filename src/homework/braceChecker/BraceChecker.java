package homework.braceChecker;

public class BraceChecker {

    //սա հենց տեքստն է
    private String text;
    Stack stack = new Stack();


    //կլասի կոնստրուկտորն է, որը պետք է ընդունի String տիպի տեքստ, և վերագրի վերևի տեքստին
    //Որ չկարողանաք BraceChecker-ի օբյեկտը սարքենք առանց text-տալու կոնստրուկտորի միջոցով․
    public BraceChecker(String text) {
        this.text = text;

    }

    //սա հիմնական մեթոդն է,որի մեջ գրելու ենք ամբողջ լոգիկան․ աշխատելու ենք թե Stack-ի հետ, թե վերևի text-ի․
    public void check() {
        char[] chars = text.toCharArray();

        for (int i = 0; i < text.length(); i++) {
            switch (chars[i]) {
                case '(':
                case '{':
                case '[':
                    stack.push(chars[i]);
                    break;

                case ')':
                    char circle = (char) stack.pop();
                    if (circle != '(') {
                        System.err.println("Error: opened " + circle + " but closed ) at " + i);
                    }
                    break;
                case '}':
                    char form = (char) stack.pop();
                    if (form != '{') {
                        System.err.println("Error: opened " + form + " but closed } at " + i);
                    }
                    break;
                case ']':
                    char rec = (char) stack.pop();
                    if (rec != '[') {
                        System.err.println("Error: opened " + rec + " but closed ] at " + i);
                    }
                    break;
                default:
            }

        }


        while (true) {
            if (stack.isEmpty() == false) {
                System.err.println("Excessive parentheses: " + (char) stack.pop());
            } else {
                break;
            }


        }

    }


}
