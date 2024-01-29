
I like the way this project is built.

 - The technical solutions are simple and reliable, which is exactly
   what we need.
 - Separation of logic and request processing.
 - I see that you have implemented test cases.
 - The UI looks and works well.
 - Bootstrap is used.
 - The quiz itself is interesting and fun.

Currently, you have only one quiz, imagine how you can add more. What you need to change and how much effort it requires?

I would like to share some ides on how to make the program more flexible:

- You can represent quest information in a JSON file. Then you can write logic that parses all JSON files and dynamically builds strategy objects based on it. This will make the program very flexible, so you can create new quests without changing the program code at all. I know that such code will be more difficult to write, but the results are worth the effort. And this is just an idea :)
- Use the [strategy pattern](https://refactoring.guru/design-patterns/strategy) for different game algorithms, it makes your code easy to extend and change the behaviour. You can check it [here](https://github.com/oleksandrhavryush/Quest_game).

In the end, you did a very good job, as in all previous projects.
I'd also like to say that you did a great job uploading your project to render, making it accessible for everyone.
I wish you good luck in your future projects :)
