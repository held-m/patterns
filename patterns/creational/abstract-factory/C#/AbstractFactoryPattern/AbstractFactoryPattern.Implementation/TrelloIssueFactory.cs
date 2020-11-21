using AbstractFactoryPattern.Implementation.Models;
using AbstractFactoryPattern.Implementation.Models.Trello;

namespace AbstractFactoryPattern.Implementation
{
    public class TrelloIssueFactory : IIssueFactory
    {
        public IIssue CreateIssue(string title, string description)
        {
            var issue = new TrelloIssue
            {
                Title = title,
                Description = description
            };
            
            return issue;
        }
    }
}