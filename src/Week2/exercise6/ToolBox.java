package Week2.exercise6;

import simpleexercises3.Tool;

import java.util.ArrayList;
import java.util.List;

public class ToolBox {
    public String color;
    public List<Tool> tools = new ArrayList<>();


    public ToolBox(String color) {
        this.color = color;
    }

    public void add(Tool tool) {
        tools.add(tool);
    }

    public List<Tool> getTools() {
        return tools;
    }
}
//A Toolbox has a color and a list of Tool.
// Its constructor only asks for the color.
// Make sure its tools are initialized with an empty collection.
// It also has the method add to add a Tool to its list and the method getTools that returns the list.





