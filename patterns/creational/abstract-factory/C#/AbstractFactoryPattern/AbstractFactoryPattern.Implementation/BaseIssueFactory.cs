using AbstractFactoryPattern.Implementation.Models;
using AbstractFactoryPattern.Implementation.Models.Base;

namespace AbstractFactoryPattern.Implementation
{
    public class BaseIssueFactory : IIssueFactory
    {
        public IIssue CreateIssue(string title, string description)
        {
            var issue = new BaseIssue
            {
                Title = title,
                Description = description
            };
            
            return issue;
        }
    }
}