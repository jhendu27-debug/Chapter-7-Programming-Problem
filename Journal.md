# Journal
Write your Journal questions and notes here.
# Phase 1

I think having a Creature superclass makes the program easier to organize. All creatures can share basic things like a name, threat level, and methods. This keeps me from having to write the same code again for every creature. It should also make it easier to add more creature types later.

# Phase 2

A Dragon is a Creature because the Dragon class extends the Creature class. This means the Dragon can use things from Creature like the name and threat level methods. Inheritance helps because I do not have to rewrite the same code for every creature. I only have to add the behavior that makes each creature different.

# Phase 3

Polymorphism lets me put different creatures into the same list and use one loop for all of them. Each creature still uses its own react method when the program runs. If I add another creature later, I can put it in the same list without changing the loop. This makes the program easier to update and organize.

# Phase 4

An architect might make a method final when they do not want other classes to change how it works. This can be useful for important methods that should work the same for every subclass. It also prevents other developers from overriding the method by mistake and changing something important in the program.

