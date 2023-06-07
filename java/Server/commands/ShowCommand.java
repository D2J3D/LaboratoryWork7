package Server.commands;

import Common.Response;
import Common.core.SpaceMarinesComparator;
import Server.collection_utils.CollectionManager;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class ShowCommand implements Command{
    private CollectionManager cm;
    private int startIndex;
    public ShowCommand(CollectionManager cm){
        this.cm = cm;
    }

    @Override
    public  Object execute() {
        if (cm.getSynchronizedMarines().size() == 0){
            return new Response("Коллекция пуста");
        }

        return new Response(Arrays.stream(Arrays.copyOfRange(cm.showMarines().stream().sorted(new SpaceMarinesComparator()).toArray(), this.startIndex, this.startIndex+100)).map(Object::toString).collect(Collectors.joining("\n")), "show");
     //   return new Response("show", cm.showMarines());
    }

    @Override
    public String descr() {
        return "Команда show";
    }
    @Override
    public void setParams(String[] param){
        this.startIndex = Integer.parseInt(param[0]);
    };

    @Override
    public String[] getParams(){
        String[] params = new String[1];
        params[0] = String.valueOf(this.startIndex);
        return params;
    };
}
