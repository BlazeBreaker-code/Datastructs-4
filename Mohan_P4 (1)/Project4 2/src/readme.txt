Suraj Mohan N01234931

    To run these programs, open in intellij and hit run.
For the CountWordsinTextfile you must specify the path of the file you want to count the
word occurrences of, in the program arguments. You can do this by hitting the run tab on
the top of intellij and click edit configurations. From there just plug in the path
to program arguments and hit apply, then run. An input file for my test run is attached to this project and
I just specified the path to that.

    For the implementation of the CountOccurrencesOfNumbers, the program uses two Hashmaps and
the Collections Api to find the max and retrieve the input with matching instance occurrence.

    For the implementation of WordsInAscending because we need to keep the order ascending a Treemap
was used with an Arraylist. We get the instances then add them to the Arraylist after going through our compareTo method and then
use the Collections Api to sort it.

    For the implementation of the CountWordsInTextfile we create a Treemap and then scan the input file as
the program arguments. Splitting them once the pass thorough parameters indicating spaces or
symbols, then putting it in the storage method. There it changes the case to lowercase and sorts the instances.