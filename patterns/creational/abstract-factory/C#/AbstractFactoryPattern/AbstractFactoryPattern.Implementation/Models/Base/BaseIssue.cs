using System;

namespace AbstractFactoryPattern.Implementation.Models.Base
{
    public class BaseIssue : IIssue
    {
        public BaseIssue()
        {
            Status = BaseIssueStatus.ToDo;
            CreationDate = DateTime.Now;
        }
        
        public string Title { get; set; }
        public string Description { get; set; }
        public DateTime CreationDate { get; set; }
        public BaseUser Assigner { get; set; }
        public BaseUser Reporter { get; set; }
        public BaseIssueStatus Status { get; set; }
    }
}