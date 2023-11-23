import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { NavbarComponent } from './navbar/navbar.component';
import { SidebarComponent } from './sidebar/sidebar.component';

@NgModule({
    declarations: [
        NavbarComponent,
        SidebarComponent
    ],
    imports: [
        CommonModule,
        FormsModule
    ],
    exports: [
        NavbarComponent,
        SidebarComponent
    ]
})
export class SharedModule { }