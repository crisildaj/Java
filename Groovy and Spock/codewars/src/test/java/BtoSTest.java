import org.junit.Test

class TestKata {
  @Test
  void FixedTests() {
    assert BtoS.booleanToString(true) == "true"
    assert Kata.booleanToString(false) == "false"
    assert Kata.booleanToString(false) == "false"
  }
