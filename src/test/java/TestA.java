import org.example.Cu;
import org.example.Mark;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TestA {

    private Cu cu;

    @BeforeEach
    public void setUp() {

        ArrayList<Mark> marks = new ArrayList<>();


        cu = new Cu("Matemática", marks, 3);
    }

    @Test
    public void testInsertMarkCU() {

        cu.insertMarkCU(1, 15.5);
        assertEquals(15.5, cu.searchStudent(1),0.01);//necessário margem de erro quando comparamos float ou double



    }

    @Test
    public void testSearchStudent() {
        assertEquals(-1, cu.searchStudent(4));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 10",  // Aluno 1, Nota 10
            "2, 15",  // Aluno 2, Nota 15
            "3, 15"   // Aluno 3, Nota 15
    })
    public void testAverageCU(int numStudent, double mark) {
        cu.insertMarkCU(numStudent, mark);
    }

    @Test
    public void testAverageAfterInsertions() {
        // Insira todas as notas primeiro
        cu.insertMarkCU(1, 10);
        cu.insertMarkCU(2, 15);
        cu.insertMarkCU(3, 15);

        // Agora, verifique a média
        assertEquals(13.33, cu.averageCU(), 0.01);
    }


    @Test
    public void testIsApproved() {

        cu.insertMarkCU(2, 10);
        cu.insertMarkCU(2, 5);
        assertFalse(cu.isApproved(2));
    }
}
