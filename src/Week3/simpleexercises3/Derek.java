package simpleexercises3;

public class Derek {
    Tool tool = new Tool(" ");

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public Boolean canHangPainting(){
        return tool.getName().equals("hammer");

    }

    public void hangPainting(){
        if (canHangPainting() ){
            System.out.println("I can hang the painting");
        } else

        System.out.println("I miss the hammer");
    }





}


