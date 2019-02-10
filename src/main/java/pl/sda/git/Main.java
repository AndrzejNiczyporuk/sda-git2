package pl.sda.git;

import pl.sda.git.impl.*;

import java.util.*;

public class Main {
	private static final Map<String, Action> possibleActions = new LinkedHashMap<>();
	
	static {
		possibleActions.put("concat", new ConcatAction());
		possibleActions.put("1-sort", new SortAlphaAction());
		possibleActions.put("2-AddNum", new AddNumArgsAction());
		possibleActions.put("3-ReaplaceBtoAbc", new ReplaceBtoAbcAction());

		possibleActions.put("4-AddIfTen", new AddIfTenAction());
		possibleActions.put("5-AddJava", new AddJavaAction());
		possibleActions.put("6-Cut3", new Cut3Action());
		possibleActions.put("7-ShowDateIf3", new ShowDateIf3Action());
		possibleActions.put("8-ExceptionIf4", new ExceptionIf4Action());
		possibleActions.put("9-ShowACount", new ShowACountAction());
		possibleActions.put("10-ShowKot", new ShowKotAction());
		possibleActions.put("11-LengthYesNo", new LengthYesNoAction());
		possibleActions.put("12-ShowJava", new ShowJavaHomeAction());
		possibleActions.put("13-AddAllLengths", new AddAllLengthsAction());
	}
	
	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		System.out.println("Mozliwe akcje");
		
		possibleActions.entrySet().stream()
				.map(Map.Entry::getKey)
				.map(name -> "\t" + name)
				.forEach(System.out::println);
		
		System.out.println("Jaką akcje chcesz wykonac");
		final String actionName = scanner.nextLine();
		
		if (possibleActions.containsKey(actionName)) {
			System.out.println("Podaj argumenty?");
			final String argumentLine = scanner.nextLine();
			String[] argsWithoutSpaces = argumentLine.trim().split("\\s+"); // split po jednej lub wielu spacjach
			final List<String> arguments = Arrays.asList(argsWithoutSpaces);
			
			final Action action = possibleActions.get(actionName);
			final String result = action.doIt(arguments);
			System.out.println(result);
		} else {
			System.out.println("Podano nieprawidlową akcje!");
		}
	}
	
}
