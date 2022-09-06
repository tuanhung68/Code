SELECT * FROM [Suppliers];
SELECT "SupplierName", "Country" FROM suppliers
WHERE "Country" = 'Canada';

SELECT * FROM [Products] WHERE "Price" > 200;
SELECT * FROM [Products] WHERE "Price" <= 18 
ORDER BY "ProductName";-- Ascending order, ORDER BY "ProductName" DESC: Descending order
SELECT * FROM [Products] 
WHERE "Unit" like '%bottle%' and "ProductName" like '%lager%';

SELECT "CategoryName", "ProductName" FROM Categories
JOIN Products ON Categories."CategoryID" = Products."CategoryID"
ORDER BY "CategoryName", "ProductName";
