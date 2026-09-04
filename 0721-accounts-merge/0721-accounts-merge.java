class Solution {

    public List<List<String>> accountsMerge(List<List<String>> accounts) {

        Map<String, List<String>> graph = new HashMap<>();
        Map<String, String> emailToName = new HashMap<>();

        // Build graph
        for (List<String> account : accounts) {

            String name = account.get(0);
            String firstEmail = account.get(1);

            for (int i = 1; i < account.size(); i++) {

                String email = account.get(i);

                emailToName.put(email, name);

                graph.putIfAbsent(email, new ArrayList<>());
                graph.putIfAbsent(firstEmail, new ArrayList<>());

                if (!email.equals(firstEmail)) {
                    graph.get(firstEmail).add(email);
                    graph.get(email).add(firstEmail);
                }
            }
        }

        Set<String> visited = new HashSet<>();
        List<List<String>> ans = new ArrayList<>();

        for (String email : graph.keySet()) {

            if (visited.contains(email))
                continue;

            List<String> component = new ArrayList<>();

            dfs(email, graph, visited, component);

            Collections.sort(component);

            component.add(0, emailToName.get(email));

            ans.add(component);
        }

        return ans;
    }

    private void dfs(
        String email,
        Map<String, List<String>> graph,
        Set<String> visited,
        List<String> component
    ) {

        visited.add(email);
        component.add(email);

        for (String neighbour : graph.get(email)) {

            if (!visited.contains(neighbour)) {
                dfs(neighbour, graph, visited, component);
            }
        }
    }
}