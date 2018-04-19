package ru.itis;

public class Analyzer {

//    public void calculateVariables (ArrayList<String> a, String str) {
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) - 'A' >= 0 && str.charAt(i) - 'Z' <= 0) {
//                a.add(str.charAt(i) + "=0");
//                i = i + 3;
//                while (str.charAt(i) != ';') {
//                    int curr1, curr2;
//                    if (str.charAt(i) - 'A' >= 0 && str.charAt(i) - 'Z' <= 0) {
//                        for (int j = 0; j < a.size(); j++) {
//                            String curr = a.get(j);
//                            if (curr.charAt(0) == str.charAt(i)) {
//                                curr1 = Integer.parseInt(curr);
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }



    public void analyze(String input){

        int status = 0;

        for (int i = 0; i < input.length(); i++) {

            switch (status) {
                case 0:
                    if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')
                        status = 1;
                    else
                        throw new SyntaxException();
                    break;
                case 1:
                    if (input.charAt(i) >= '0' && input.charAt(i) <= '9')
                        status = 2;
                    else
                        throw new SyntaxException();
                    break;
                case 2:
                    if (input.charAt(i) == ':')
                        status = 3;
                    else
                        throw new SyntaxException();
                    break;
                case 3:
                    if (input.charAt(i) == '=')
                        status = 4;
                    else
                        throw new SyntaxException();
                    break;
                case 4:
                    if (input.charAt(i) <= '9' && input.charAt(i) >= '0')
                        status = 5;
                    else if (input.charAt(i) <= 'Z' && input.charAt(i) >= 'A')
                        status = 7;
                    else if (input.charAt(i) == ';')
                        status = 0;
                    else
                        throw new SyntaxException();
                    break;
                case 5:
                    if (input.charAt(i) <= '9' && input.charAt(i) >= '0')
                        status = 5;
                    else if (input.charAt(i) == ';')
                        status = 0;
                    else
                        throw new SyntaxException();
                    break;
                case 7:
                    if (input.charAt(i) <= '9' && input.charAt(i) >= '0')
                        status = 9;
                    else
                        throw new SyntaxException();
                    break;
                case 9:
                    if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*' || input.charAt(i) == '/')
                        status = 4;
                    else if (input.charAt(i) == ';')
                        status = 0;
                    else
                        throw new SyntaxException();
                    break;
                default:
                    throw new SyntaxException();

            }
        }

        if (status != 0)
            throw new SyntaxException();

    }
}





