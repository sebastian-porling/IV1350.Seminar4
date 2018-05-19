# Changes

This are the changes from the design.

### Removing "Tax Rate"

I'm removing tax rate as i don't really find it necessery. It should be enough to use "Tax Amount".

### Renaming ItemDescription

I renamed ItemDescription to ItemDTO, because it does not have any logic.

### Removing of price, quantity and taxamount

I removed these classes as they are the same as the class "Amount". It's only a different name.

### Removed SaleInformation

When looking at the design and at the base code it seems that both Sale and SaleInformation are the same classes.
Sale is like a wrapper of SaleInformation.

### Decided to not to discounts

Did not have the time to add the discount flow.

### Added methods to sale

I needed to add a getter to the sale class as the external inventory system needs to get information about the items.

