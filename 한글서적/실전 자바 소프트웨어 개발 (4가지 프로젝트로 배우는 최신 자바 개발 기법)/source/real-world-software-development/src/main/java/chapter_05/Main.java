package chapter_05;

public class Main {

    public static void main(String[] args) {
        var env = new Facts();

        final var businessRuleEngine = new BusinessRuleEngine(env);

        businessRuleEngine.addAction(facts -> {
            final String jobTitle = facts.getFact("jobTitle");
            if ("CEO".equals(jobTitle)) {
                final String name = facts.getFact("name");
//                Mailer.sendEmail("sales@company.com", "Relevant customer: " + name);
            }
        });
    }
}
