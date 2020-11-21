using System;

namespace AbstractFactoryPattern.Implementation.Models.Trello
{
    public class TrelloIssue : IIssue
    {
        public TrelloIssue()
        {
            CreationDate = DateTime.Now;
        }
        
        public string Title { get; set; }
        public string Description { get; set; }
        public DateTime CreationDate { get; set; }
        public TrelloUser[] Members { get; set; }
        public string Status { get; set; }
    }
}