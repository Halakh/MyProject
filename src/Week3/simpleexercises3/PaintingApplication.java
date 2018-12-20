package simpleexercises3;

public class PaintingApplication  {
    public static void main(String[] args) {
        Tool tool =new Tool(" ");
        Derek derek = new Derek();
        derek.hangPainting();

        Tool tool1 = new Tool("hammer");
        derek.setTool(tool1);
        derek.hangPainting();

    }




    }


