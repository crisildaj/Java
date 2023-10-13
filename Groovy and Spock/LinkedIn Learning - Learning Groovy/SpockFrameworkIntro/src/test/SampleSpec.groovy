import spock.lang.Specification
class SampleSpec extends Specification {

    static def "validate string concatenation"(){
        given:
        //act
        def string1 = "Hello"
        def string2 = "World!"

        when:
        // arrange
        def stringConcatenated = string1.concat(string2)

        then:
        // assert
        stringConcatenated == "HelloWorld!"

    }
}
