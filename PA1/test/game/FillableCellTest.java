package game;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * 
 */

public class FillableCellTest {

	private FillableCell fillableCell;
	
	@AfterEach
    void tearDown() {
		fillableCell = null;
    }
	/*
	 * This method tests the Fillable cell constructor with one param i.e. Coordinate
	 * */
	@Test
	public void constructorTest_PipeNull(){
		fillableCell = new FillableCell(new Coordinate(0, 0));
		assertNull(fillableCell.getPipe().get());
	}
	
	/*
	 * This method tests the Fillable cell constructor with two params i.e. Coordinate and Pipe
	 * */
	@Test
	public void constructorTest_PipeNotNull(){
		Pipe pipe = new Pipe(Pipe.Shape.CROSS);
		fillableCell = new FillableCell(new Coordinate(0, 0), pipe);
		assertEquals(pipe,fillableCell.getPipe().get());
	}
}
