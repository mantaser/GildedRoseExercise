## Gilded Rose code refactoring exercise

Resource for starter files: https://github.com/emilybache/GildedRose-Refactoring-Kata

## Aditional functionality added to refactored code:

1. Upgraded item update algorithm to process items asynchronously.
2. Implemented GildedRose items rest service (only items list endpoint) in Spring Boot
3. Implemented MongoDB database for items storing.
4. Implemented scheduler to update items with method updateQuality() once a day.
5. Code is covered with jUnit parameterized tests.

## Sample items in database after updateQuality() method.

![Default state](images/sampleDatabase.png?raw=true "sampleDatabase")
