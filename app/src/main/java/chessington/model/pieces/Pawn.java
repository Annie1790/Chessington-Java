package chessington.model.pieces;

import chessington.model.Board;
import chessington.model.Coordinates;
import chessington.model.Move;
import chessington.model.PlayerColour;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends AbstractPiece {
    public Pawn(PlayerColour colour) {
        super(Piece.PieceType.PAWN, colour);
    }

    @Override
    public List<Move> getAllowedMoves(Coordinates from, Board board) {
        ArrayList<Move> possibleMoves = new ArrayList<>();
        if (colour == PlayerColour.BLACK) {
            Move validMove = new Move(from, from.plus(+1, 0));
            possibleMoves.add(validMove);
            return possibleMoves;
        } else {
            Move validMove = new Move(from, from.plus(-1, 0));
            possibleMoves.add(validMove);
            return possibleMoves;
        }
    }
}
