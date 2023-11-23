import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { MenuService } from 'src/app/service/menu.service';

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.scss']
})
export class SidebarComponent {

  constructor(
    private router: Router,
    public menuService: MenuService
  ) { }


  selectMenu(menu: number) {
    switch (menu) {
      case 1:
        this.router.navigate(['/dashboard']);
        break;

      case 2:
        this.router.navigate(['/usuario']);
        break;

      case 3:
        this.router.navigate(['/empresa']);
        break;

      case 4:
        this.router.navigate(['/produto']);
        break;

      default:
        break;
    }

    this.menuService.menuSelecionado = menu;

  }

}