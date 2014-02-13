abc-bank
========

1. The original code has been refactored to have composition instead of inheritence.

2. Original code had messed up associating behaviour to its related classes. The new code takes care of this.

3. Original code had switch/if constructs which are now eliminated by new design. 

4. Enums are introduced.

5. Interest Calculation Algorithms are decoupled form the Account Types making it possible to change the interest rate algorithms
   using Composite - Open Closed Principle.

6. Use of Junit 4 with Hamcrest Feature to write Unit Tests.

7 The code is designed in such a way that it can be configured with the Dependency Injection Framework.
