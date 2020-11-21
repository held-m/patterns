using AbstractFactoryPattern.Implementation.Models;

namespace AbstractFactoryPattern.CLI
{
    public interface IIssueService
    {
        IIssue CreateIssue(string title, string description);
    }
}