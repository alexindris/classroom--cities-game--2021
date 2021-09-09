package com.drpicox.game.components.typeds;

import com.drpicox.game.games.Game;
import com.drpicox.game.games.api.GameResponder;
import com.drpicox.game.games.api.GameResponse;
import com.drpicox.game.players.Player;
import org.springframework.stereotype.Component;

@Component
public class TypedsResponder implements GameResponder {

    private final TypedsController typedsController;

    public TypedsResponder(TypedsController typedsController) {
        this.typedsController = typedsController;
    }

    @Override
    public void respond(GameResponse response, Game game, Player playingPlayer) {
        var components = typedsController.findAllByGame(game);
        components.forEach(c -> {
            var entityId = c.getEntityId();
            response.putEntityProperty(entityId, "isTyped", true);
            response.putEntityProperty(entityId, "entityType", c.getEntityType());
        });
    }
}
