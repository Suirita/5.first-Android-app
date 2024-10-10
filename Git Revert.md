2024-10-09 21:03

Tags:[[Programing]]

Status:[[Done]]

# 1.What is Git revert?

**`git revert`** is a command used in Git to *undo changes* made by a previous commit. It creates a **new commit** that undoes the changes from the specified commit.

# 2.View Commit History:

**`git log --oneline`**: This command shows the commit history in a simplified form, listing commit IDs and messages in one line each.

# 3.Revert a Commit:

**`git revert <commit-hash>`**

**commit-hash**: The unique ID of the commit it look something like this: **`a3b42f10c7d7b9a1a3d7e12345f1bc6ab089aecd`**

# 3.Push Changes to the Remote Repository:

**`git push origin main`**: Push your local changes (including the new revert commit) to the remote repository.

# 4. When to Use `git revert`:

- When you want to *undo a commit* without affecting the commit history.
- In *collaborative projects*, to avoid disrupting other team members' work.

# References
[Official Git Documentation](https://git-scm.com/docs/git-revert)
[Atlassian Git Tutorial](https://www.atlassian.com/git/tutorials/undoing-changes/git-revert)
