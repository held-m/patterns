using System;
using AbstractFactoryPattern.Implementation;

namespace AbstractFactoryPattern.CLI
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hi let's create issue!");

            Console.WriteLine("Enter issue title");
            var title = Console.ReadLine();

            Console.WriteLine("Enter issue description");
            var description = Console.ReadLine();
            
            Console.WriteLine("Choose system to contain issue? (base, trello)");
            var saveCommand = Console.ReadLine();

            switch (saveCommand?.ToLower())
            {
                case "trello":
                {
                    var trelloIssueFactory = new TrelloIssueFactory();
                    var issueService = new IssueService(trelloIssueFactory);
                    var issue = issueService.CreateIssue(title, description);

                    Console.WriteLine($"Success for issue: {issue.Title}");
                    Console.WriteLine(issue.GetType());
                    break;
                }

                case "base":
                {
                    var baseIssueFactory = new BaseIssueFactory();
                    var issueService = new IssueService(baseIssueFactory);
                    var issue = issueService.CreateIssue(title, description);
                    
                    Console.WriteLine($"Success for issue: {issue.Title}");
                    Console.WriteLine(issue.GetType());
                    break; 
                }
            }

            Console.WriteLine("Press any key");
            Console.ReadKey();
        }
    }
}
