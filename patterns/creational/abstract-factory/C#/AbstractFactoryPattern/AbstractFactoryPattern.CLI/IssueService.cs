using AbstractFactoryPattern.Implementation;
using AbstractFactoryPattern.Implementation.Models;

namespace AbstractFactoryPattern.CLI
{
    public class IssueService : IIssueService
    {
        private readonly IIssueFactory _issueFactory;

        public IssueService(IIssueFactory issueFactory)
        {
            _issueFactory = issueFactory;
        }

        public IIssue CreateIssue(string title, string description)
        {
            return _issueFactory.CreateIssue(title, description);
        }
    }
}