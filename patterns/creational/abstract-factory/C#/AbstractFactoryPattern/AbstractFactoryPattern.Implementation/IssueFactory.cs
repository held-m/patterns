using System;
using AbstractFactoryPattern.Implementation.Models;

namespace AbstractFactoryPattern.Implementation
{
    public interface IIssueFactory
    {
        IIssue CreateIssue(string title, string description);
    }
}