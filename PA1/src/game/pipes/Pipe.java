package game.pipes;

import game.MapElement;
import org.jetbrains.annotations.NotNull;
import util.Direction;
import util.PipePatterns;

public class Pipe implements MapElement {

    @NotNull
    private final Shape shape;
    private boolean filled = false;

    /**
     * Creates a new pipe with a given shape.
     *
     * @param shape Shape of the pipe.
     */
    public Pipe(@NotNull Shape shape) {
        // TODO
    }

    /**
     * Sets the pipe as filled.
     */
    public void setFilled(boolean filled) {
        // TODO
		this.filled = filled;
    }

    /**
     * @return Whether this pipe is filled.
     */
    public boolean getFilled() {
        // TODO
        return filled;
    }

    /**
     * @return List of connections for this pipe.
     * @throws IllegalStateException if {@code this} pipe cannot be identified.
     */
    public @NotNull Direction[] getConnections() {
        // TODO
    }

    /**
     * @return The character representation of this pipe. Note that the representation is different for filled and
     * unfilled pipes.
     */
    @Override
    public char toSingleChar() {
        // TODO
    }

    /**
     * Converts a String to a Pipe.
     *
     * <p>
     * Refer to README for the list of ASCII representation to the pipes.
     * </p>
     *
     * @param rep String representation of the pipe. For example, "HZ" corresponds to a pipe of horizontal shape.
     * @return Pipe identified by the string.
     * @throws IllegalArgumentException if the String does not represent a known pipe.
     */
    public static @NotNull Pipe fromString(@NotNull String rep) {
        // TODO
    }

    public enum Shape {
        HORIZONTAL(PipePatterns.Filled.HORIZONTAL, PipePatterns.Unfilled.HORIZONTAL),
        VERTICAL(PipePatterns.Filled.VERTICAL, PipePatterns.Unfilled.VERTICAL),
        TOP_LEFT(PipePatterns.Filled.TOP_LEFT, PipePatterns.Unfilled.TOP_LEFT),
        TOP_RIGHT(PipePatterns.Filled.TOP_RIGHT, PipePatterns.Unfilled.TOP_RIGHT),
        BOTTOM_LEFT(PipePatterns.Filled.BOTTOM_LEFT, PipePatterns.Unfilled.BOTTOM_LEFT),
        BOTTOM_RIGHT(PipePatterns.Filled.BOTTOM_RIGHT, PipePatterns.Unfilled.BOTTOM_RIGHT),
        CROSS(PipePatterns.Filled.CROSS, PipePatterns.Unfilled.CROSS);

        final char filledChar;
        final char unfilledChar;

        /**
         *
         * @param filled Representation of {@code this} shape when filled
         * @param unfilled Representation of {@code this} shape when unfilled
         */
        Shape(char filled, char unfilled) {
            this.filledChar = filled;
            this.unfilledChar = unfilled;
        }

        /**
         *
         * @param isFilled The filling state of {@code this} shape
         * @return The character representation of {@code this} shape according to the filling state
         */
        char getCharByState(boolean isFilled) {
            // TODO
            return '\0';
        }
    }
}
