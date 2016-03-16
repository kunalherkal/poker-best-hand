#Poker Best Hand

A standard deck of playing cards has four suits - spades, hearts, diamonds, and clubs - and thirteen cards in each suit. Two is the lowest rank, followed by other integers up to ten; then the jack, queen, king, and ace.

It's convenient to represent these cards as suit/rank pairs, such as H5 or DQ: the heart five and diamond queen respectively. For purposes of determining rank, we will define the cards to be valued from 0 (the two) to 12 (the ace) [Few more examples, 10 is Q and 5 is 3]. A ten will always be represented with the single character "T", rather than the two characters "10".

Write a function that takes five cards as input and returns the best poker hand that can be made with five cards. The hand rankings are listed below for your convenience.

- Four of a kind: Four of the cards have the same rank
- Full House: Three cards of one rank, the other two of another rank
- Flush: All cards in the same suit
- Straight: All cards in sequence (aces can be high or low, but not both at once) 
- Three of a kind: Three of the cards have the same rank
- Pair: Two cards have the same rank
- High card: None of the above conditions are met

A function should return the best poker hand as a string, for example "four-of-a-kind", "full-house", "flush", "straight", "three-of-a-kind", "pair", "high-card"
- Example 1: Input ["HA" "H2" "S3" "D4" "C5"], Output: "straight" 
- Example 2: Input ["HA" "HK" "H2" "H4" "HT"], Output: "flush" 
- Example 3: Input ["SA" "HA" "CA" "C2" "C5"], Output: "three-of-a-kind" 
- Example 4: Input ["S2" "D5" "C7" "ST" "HA"], Output: "high-card"

###Expectations:
- 1. You are required to help create the software that works according to the sample inputs applied and generates output as shown in the Input-Output section shown for the problem.
- 2. You should demonstrate the working software by building a console application or writing test program that exercises the sample inputs, for this purpose you may use jUnit or any other testing framework.
- 3. Maturity of your solution will be judged on your object oriented analysis and design skills. Your coding skills will also be judged.
- 4. Please note that the problems below do not require any relational database or knowledge of underlying OS or Windowing platform.
- 5. There can be future stories which can be asked to play later.
