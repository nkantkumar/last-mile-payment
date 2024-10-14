package sg.npayment.geek;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

// This class demonstrates how we can write
// assertions for {@code List} objects
// by using AssertJ
@DisplayName("List assertion writes sample tests")
class ListAssertionSampleTest {

    @Nested
    @DisplayName("When we write assertions for elements")
    class SampleAssertionsForElements {

        private final int EXPECTED_SIZE = 2;
        private Object firstObject;
        private Object secondObject;
        private List<Object> objectList;

        @BeforeEach
        void creationAndInitializationList() {
            firstObject = new Object();
            secondObject = new Object();

            objectList = Arrays.asList(firstObject, secondObject);
        }

        @Test
        @DisplayName("Checking for the list should contain two elements")
        void whenThereAreTwoElements() {
            assertThat(objectList).hasSize(EXPECTED_SIZE);
        }

        @Test
        @DisplayName("Checking for the list should contain two elements (with custom error message)")
        void whenThereAreTwoElementsWithCustomErrorMessage() {
            assertThat(objectList)
                    .overridingErrorMessage(
                            "Expected the size of the list to be: %d but it was: %d",
                            EXPECTED_SIZE,
                            objectList.size()
                    )
                    .hasSize(EXPECTED_SIZE);
        }

        @Test
        @DisplayName("When there are correct elements in given order")
        void whenThereAreCorrectElementsInGivenOrder() {
            assertThat(objectList).containsExactly(firstObject, secondObject);
        }

        @Test
        @DisplayName("When there are correct elements in given order (with custom error message)")
        void whenThereAreCorrectElementsInGivenOrderWithCustomErrorMessage() {
            assertThat(objectList)
                    .overridingErrorMessage(
                            "Expected the list to contain the objects: %s and %s but it contained: %s",
                            firstObject,
                            secondObject,
                            Arrays.toString(objectList.toArray())
                    )
                    .containsExactly(firstObject, secondObject);
        }

        @Test
        @DisplayName("When there are correct elements in any order")
        void whenThereAreCorrectElementsInAnyOrder() {
            assertThat(objectList).containsExactlyInAnyOrder(secondObject, firstObject);
        }

        @Test
        @DisplayName("When there are correct elements in any order (with custom error message)")
        void whenThereAreCorrectElementsInAnyOrderWithCustomErrorMessage() {
            assertThat(objectList)
                    .overridingErrorMessage(
                            "Expected the list to contain the objects: %s and %s in any order but it contained: %s",
                            secondObject,
                            firstObject,
                            Arrays.toString(objectList.toArray())
                    )
                    .containsExactlyInAnyOrder(secondObject, firstObject);
        }

        @Test
        @DisplayName("When there are correct elements present for once")
        void whenThereAreCorrectElementsOnce() {
            assertThat(objectList).containsOnlyOnce(firstObject);
        }

        @Test
        @DisplayName("When there are correct elements present for once (with custom error message)")
        void whenThereAreCorrectElementsWithCustomErrorMessage() {
            assertThat(objectList)
                    .overridingErrorMessage(
                            "Expected the list to contain the object: %s only",
                            firstObject
                    )
                    .containsOnlyOnce(firstObject);
        }

        @Test
        @DisplayName("Check that list should not contain an incorrect element")
        void whenNotContainIncorrectElement() {
            assertThat(objectList).doesNotContain(new Object());
        }

        @Test
        @DisplayName("Check that list should not contain an incorrect element (with custom error message)")
        void whenNotContainIncorrectElementWithCustomErrorMessage() {
            Object incorrect = new Object();
            assertThat(objectList)
                    .overridingErrorMessage(
                            "Expected the list to not contain the object: %s",
                            incorrect
                    )
                    .doesNotContain(new Object());
        }
    }

    @Nested
    @DisplayName("Comparison of two lists")
    class ComparisonOfTwoLists {

        private final List<Integer> FIRSTLIST = Arrays.asList(100, 200, 500);
        private final List<Integer> SECONDLIST = Arrays.asList(100, 200, 500);

        @Test
        @DisplayName("List should contain the same elements")
        void listShouldContainSameElements() {
            assertThat(FIRSTLIST).isEqualTo(SECONDLIST);
        }

        @Test
        @DisplayName("List Should contain the same elements (with custom error message)")
        void listShouldContainSameElementsWithCustomErrorMessage() {
            assertThat(FIRSTLIST)
                    .overridingErrorMessage(
                            "Expected the list to contain: %s but it contained: %s",
                            Arrays.toString(SECONDLIST.toArray()),
                            Arrays.toString(FIRSTLIST.toArray())
                    )
                    .isEqualTo(SECONDLIST);
        }
    }
}
