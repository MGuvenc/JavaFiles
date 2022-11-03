// yorumlanacak olan içeriktir.

class context {

    public string formula;

    public int totalpoint;

}

//dil bilgisindeki terminal ifadeler üzerinde işlem yapar.

class accountingexpression implements ıjobexpression {

    public void interpret(context context) {

        if (context.formula.contains("m")) {

            context.totalpoint += 3000;

        }

    }

}

class developerexpression implements ıjobexpression {

    public void interpret(context context) {

        if (context.formula.contains("g")) {

            context.totalpoint += 4000;

        }

    }

}

// yorumlama işleminin tanımlandığı arayüz.

interface ıjobexpression {

    void interpret(context context);

}

import java.util.arraylist;

import java.util.list;

class jobmanager {

    public list<ıjobexpression> createexpressiontree(string formula) {

        list<ıjobexpression> tree = new arraylist<>();

        for (char role : formula.tochararray()) {

            switch (role) {

                case 'g':

                    tree.add(new developerexpression());

                    break;

                case 'm':

                    tree.add(new accountingexpression());

                    break;

                case 'l':

                    tree.add(new teamleadexpression());

                    break;

                default:

                    new exception("unexpected role!");

            }

        }

        return tree;

    }

    public void runexpression(context context) {

        for (ıjobexpression expression : createexpressiontree(context.formula)) {

            expression.interpret(context);

        }

    }

}

class teamleadexpression implements ıjobexpression {

    public void interpret(context context) {

        if (context.formula.contains("l")) {

            context.totalpoint += 7000;

        }

    }

}

//Test

public class app {

    public static void main(string[] args) {

        context context = new context();

        context.formula = "ggml";

        jobmanager jobmanager = new jobmanager();

        jobmanager.runexpression(context);

        system.out.println(context.formula + " :> " + context.totalpoint);

        // output: ggml :> 18000

    }

} 
