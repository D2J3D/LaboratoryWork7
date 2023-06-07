package Common;

import Common.core.SpaceMarine;

import java.io.Serializable;
import java.util.List;

public class Response implements Serializable {
    private final List<SpaceMarine> spaceMarines;
    private final String message;
    private final String question;

    public Response(String message){
        this.message = message;
        this.question = null;
        this.spaceMarines = null;
    }
    public Response(String message, List<SpaceMarine> spaceMarines){
        this.message = message;
        this.question = null;
        this.spaceMarines = spaceMarines;
    }
    public Response(String message, String question){
        this.message = message;
        this.question = question;
        this.spaceMarines = null;
    }

    public String getMessage() {
        return message;
    }

    public String getQuestion() {
        return question;
    }

    public List<SpaceMarine> getSpaceMarines() {
        return spaceMarines;
    }
}
