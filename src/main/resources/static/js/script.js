document.addEventListener("DOMContentLoaded", function () {
  const dropdownSubmenus = document.querySelectorAll('.dropdown-submenu');

  dropdownSubmenus.forEach(function (submenu) {
    submenu.addEventListener('mouseenter', function () {
      const subDropdown = submenu.querySelector('.dropdown-menu');
      if (window.innerWidth > 992 && subDropdown) {
        subDropdown.style.display = 'block';
      }
    });

    submenu.addEventListener('mouseleave', function () {
      const subDropdown = submenu.querySelector('.dropdown-menu');
      if (window.innerWidth > 992 && subDropdown) {
        subDropdown.style.display = 'none';
      }
    });
  });

  // Toggle submenu on click for mobile view
  document.querySelectorAll('.dropdown-submenu > .dropdown-item').forEach(function (item) {
    item.addEventListener('click', function (e) {
      if (window.innerWidth <= 992) {
        e.preventDefault();
        const subMenu = item.nextElementSibling;
        if (subMenu && subMenu.classList.contains('dropdown-menu')) {
          subMenu.style.display = (subMenu.style.display === 'block') ? 'none' : 'block';
        }
      }
    });
  });
});
